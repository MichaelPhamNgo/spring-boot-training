import {useParams, useHistory} from "react-router-dom";

export default function PathVariable(props) {
    let {id} = useParams();
    let history = useHistory();

    const goHome = () => {
        history.push("/")
    }

    return (
        <div>
            The path variable is {id}
            <button onClick={goHome}>home</button>
        </div>
    )
}
