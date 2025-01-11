import {useHistory, useLocation} from "react-router-dom";

function RequestParam() {
    const location = useLocation();
    const queryParams = new URLSearchParams(location.search)
    let history = useHistory();

    const goHome = () => {
        history.push("/")
    }

    return (
        <div>
            The request param is {queryParams.get('from')}
            <button onClick={goHome}>home</button>
        </div>
    )
}
export default RequestParam;
