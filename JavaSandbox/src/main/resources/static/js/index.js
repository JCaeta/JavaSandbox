var postButton = document.getElementById("post-button");
var getButton = document.getElementById("get-button");

getButton.onclick = function (){
    const request = new XMLHttpRequest();
    request.open("GET", "http://localhost:8080/get-request", true);
    request.setRequestHeader("Content-type", "application/json");
    request.send();
    request.onreadystatechange = function() {
        if(request.readyState === 4 && request.status === 200) {
            response = JSON.parse(request.response);
            console.log(response);
            console.log("Response in JavaScript: " + response.response.res);
        }
    }
}

postButton.onclick = function() {
    const request = new XMLHttpRequest();
    request.open("POST", "http://localhost:8080/post-request", true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(2);
    request.onreadystatechange = function() {
        if(request.readyState === 4 && request.status === 200) {
            response = JSON.parse(request.response);
            console.log(response);
            console.log("Response in JavaScript: " + response.response.res);
        }
    }
}




// function onTableClick(element){
//     console.log(element)
//     let index = element.rowIndex;
//     const request = new XMLHttpRequest();
//     request.open("POST", "http://localhost:8080/on-table-click", true);
//     request.setRequestHeader("Content-type", "application/json");
//     request.send(index);
// }


