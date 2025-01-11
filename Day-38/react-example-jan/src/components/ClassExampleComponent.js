import React from "react";
import FunctionalChild from "./FunctionalChild";
import ChildClassComponent from "./ChildClassComponent";
import {getResponse, getResponse2} from "../service/HttpService";
import './ClassExampleComponent.css'

class ClassExampleComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            message: "state message",
            message2: "another message",
            fruits: ['apple', 'banana', 'orange'],
            input: "",
            json: {}
        }
    }

    componentDidMount() {
        getResponse()
            .then(resp => this.setState({json: resp.data}))
        getResponse2()
            .then(resp => resp.json())
            .then(data => console.log(data))
    }

    changeMessage = () => {
        this.setState({message: "changed state message"});
    }

    changeInput = (event) => {
        this.setState({input: event.target.value});
    }

    addToArray = () => {
        this.setState({fruits: [...this.state.fruits, this.state.input], input: ""});
    }

    render() {
        return (
            <div>
                {/*<h3>{this.state.message}</h3>*/}
                {/*<h4>{this.state.message2}</h4>*/}
                {/*<button onClick={this.changeMessage}>Click me</button>*/}
                {/*<ChildClassComponent myMessage={this.state.message} myMessage2={this.state.message2} changeMessage={this.changeMessage}/>*/}
                <ul>
                    {this.state.fruits.map(fruit => <FunctionalChild fruit={fruit} key={fruit}/>)
                    }
                    {/*index:       0,     1,       2*/}
                    {/*component:   apple, banana, orange*/}

                    {/*add mango between banana and orange*/}

                    {/*index:      0,      1,       2,       3*/}
                    {/*component:  apple,  banana,  mango,   orange*/}

                    {/*index of orange has changed*/}
                </ul>
                <input onChange={this.changeInput}/>
                <button style={{color: "red"}} onClick={this.addToArray}>Add</button>
                {this.state.input}
                {JSON.stringify(this.state.json)}
                <p id="paragraph">Sample input text</p>
            </div>
        )
    }
}
export default ClassExampleComponent
