import React from "react";
import FunctionalComponent from "./FunctionalComponent";
import Child from "./Child";
import {getResponse} from "../services/HttpService";
import ChildFunctional from "./ChildFunctional";
import Add from "./Add";

class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            message: "hello world",
            items: ["apple", "banana", "strawberries"],
            inputItem: ""
        }
    }

    componentDidMount() {
        getResponse().then(response => this.setState({data: response.data}));
    }

    handleItemField = (item) => {
        this.setState({inputItem: item})
    }

    addItem = () => {
        this.setState({items: [...this.state.items, this.state.inputItem]})
    }

    render() {
        return (
            <div>
                {this.state.message}
                <FunctionalComponent/>
                {this.state.items.map(item => <ChildFunctional key={item} item={item}/>)}
                <label>
                    Item:
                    <input type="text" onChange={(event => this.handleItemField(event.target.value))} value={this.state.inputItem}/>
                </label>
                <Add addItem={this.addItem}/>
                <button onClick={() => this.setState({message: "message changed"}, () => console.log("state changed"))}>Set state</button>
                {JSON.stringify(this.state.data)}
            </div>
        );
    }
}
export default Home;
