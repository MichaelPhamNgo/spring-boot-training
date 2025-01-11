import React from "react";
import "./Child.css"

export default class Child extends React.Component{
    changeProp = () => {
        this.props.message = "new message";
    }

    render() {
        return (
            <div className={"child-formatting"}>
                This is a message from child: {this.props.item}
                <button onClick={this.changeProp}>Change parent from child?</button>
            </div>
        );
    }
}
