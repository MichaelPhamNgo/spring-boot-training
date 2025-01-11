import React from "react";

class ChildClassComponent extends React.Component {
    constructor(props) {
        super(props);
    }

    changePassedInProps = () => {
        this.props.changeMessage();
    }

    render() {
        return (
            <div>
                Hello from child component
                {this.props.myMessage}
                {this.props.myMessage2}
                <button onClick={this.changePassedInProps}>My Button</button>
            </div>
        );
    }
}
export default ChildClassComponent;
