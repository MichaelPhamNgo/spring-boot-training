import {FIND_TODO} from "../constants/ToDoConstants";

export const findToDo = (todo) => ({
    type: FIND_TODO,
    todo: todo
})

