const getRespById = id =>
    fetch(`https://jsonplaceholder.typicode.com/todos/${id}`)
        .then(resp => resp.json())
export default getRespById;
