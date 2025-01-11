import {Link, Route, useHistory, useLocation} from "react-router-dom";
function NestedChild() {
    const location = useLocation();

    return (
        <div>
            From {location.pathname} child component
        </div>
    )
}
function NestedRoutes() {
    let history = useHistory();

    const goHome = () => {
        history.push("/")
    }

    return (
        <div>
            <ul>
            <li><Link to={"/nested/first"}>First</Link></li>
            <li><Link to={"/nested/second"}>Second</Link></li>
            <li><Link to={"/nested/third"}>Third</Link></li>
            </ul>
            <button onClick={goHome}>home</button>
            <Route path={`/nested/:path`}>
                <NestedChild/>
            </Route>
        </div>
    )
}
export default NestedRoutes;
