import {useHistory, useLocation} from "react-router-dom";

function PassState(props) {
    const location = useLocation();
    let history = useHistory();

    const goHome = () => {
        history.push("/")
    }

    return (
        <div>
            User: {location.user !== undefined && JSON.stringify(location.user)}
            <button onClick={goHome}>home</button>
        </div>
    )
}
export default PassState
