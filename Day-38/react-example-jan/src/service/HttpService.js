import axios from "axios";

const getResponse = () =>
    axios.get('https://jsonplaceholder.typicode.com/todos/1')

const getResponse2 = () =>
    fetch('https://jsonplaceholder.typicode.com/todos')

export {getResponse, getResponse2};
