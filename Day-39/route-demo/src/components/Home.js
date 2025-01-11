import {Link} from "react-router-dom";

const {useState} = require("react");

export default function Home(props) {
    const [user, setUser] = useState({username: "jack", password: "123"});
    const [id, setId] = useState(-1);
    return (
        <div>
            <h3>Home Component</h3>
            <div>
                <label>
                    <input type="text" value={id} onChange={event => setId(event.target.value)}/>
                </label>
            </div>
            <ul>
                <li><Link to={`/path-variable/${id}`}>Passing path param</Link></li>
                <li><Link to={{pathname: "/pass-state", user: user}}>Passing state</Link></li>
                <li><Link to="/request-param?from=home">Passing param</Link></li>
                <li><Link to="/nested">Nested</Link></li>
            </ul>
        </div>
    )
}
