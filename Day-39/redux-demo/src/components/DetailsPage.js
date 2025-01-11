import {connect} from "react-redux";
import {Link} from "react-router-dom";

function DetailsPage({todo}) {
    return (
        <div>
            <ul>
                <li>UserId: {todo.userId}</li>
                <li>Id: {todo.id}</li>
                <li>Title: {todo.title}</li>
                <li>Completed: {todo.completed ? "true" : "false"}</li>
            </ul>
            <Link to="/">Home</Link>
        </div>
    )
}

const mapStateToProps = (state) => {
    return {
        todo: state.todo
    }
}

export default connect(mapStateToProps)(DetailsPage)
