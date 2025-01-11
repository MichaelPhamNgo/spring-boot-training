import {FIND_TODO} from "../constants/ToDoConstants";

const initialState = {
    todo: { userId: -1,
        id: -1,
        title: "",
        completed: false
    }
}

const ToDoReducer = (state = initialState, action) => {
    switch (action.type) {
        case FIND_TODO:
            return {todo: action.todo}
        default:
            return state
    }
}
export default ToDoReducer
