import {useEffect, useState} from "react";
import {getMessage} from "@testing-library/jest-dom/dist/utils";
import {getResponse} from "../services/HttpService";

export default function FunctionalWithHooks(props) {
    const [name, setName] = useState("no name");

    useEffect(() => {getResponse().then(resp => console.log(resp.data))}, [])

    return (
        <div>
            {name}
            <button onClick={() => setName("Jack")}>Set name to Jack</button>
        </div>
    )
}
