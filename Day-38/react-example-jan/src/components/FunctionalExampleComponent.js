import {useEffect, useState} from "react";
import {getResponse} from "../service/HttpService";

function FunctionalExampleComponent() {
    const [message, setMessage] = useState("initial state");

    const changeMessage = () =>
        setMessage("changed state");

    useEffect(() => {
        getResponse()
            .then(resp => console.log(resp.data))
    })

    return (
        <div>
            {/*<h3>hello from functional component</h3>*/}
            {/*<h4>another header</h4>*/}
            {message}
            <button onClick={changeMessage}>Change Message</button>
        </div>
    )
}
export default FunctionalExampleComponent;
