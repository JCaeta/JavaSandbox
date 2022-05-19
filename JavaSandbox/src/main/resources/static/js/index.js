function onTableClick(element){
    console.log(element)
    let index = element.rowIndex;
    const request = new XMLHttpRequest();
    request.open("POST", "http://localhost:8080/on-table-click", true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(index);
}


