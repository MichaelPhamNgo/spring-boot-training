import React from "react";
import getRespById from "../services/HttpService";
import {findToDo} from "../actions/ToDoActions";
import {connect} from "react-redux";
import {Link} from "react-router-dom";

class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            numberInput: 1
        }
    }

    changeInput = (id) => {
        this.setState({numberInput: id})
    }

    render() {
        return (
            <div>
                <label>
                    Enter a number between 1 and 200
                    <input type={"number"} value={this.state.numberInput} onChange={(evt) => this.changeInput(evt.target.value)}/>
                </label>
                <button onClick={() => this.props.findToDoById(this.state.numberInput)}>Get http call</button>
                <div>
                    {this.props.todo.id > -1 &&
                        <Link to="/details">Details for to-do item: {this.props.todo.title}</Link>
                    }
                </div>
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        todo: state.todo
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        findToDoById: (id) => {
            getRespById(id)
                .then(todo => dispatch(findToDo(todo)))
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(Home)
