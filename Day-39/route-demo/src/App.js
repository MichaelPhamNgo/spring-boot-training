import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route} from "react-router-dom";
import Home from "./components/Home";
import PathVariable from "./components/PathVariable";
import PassState from "./components/PassState";
import RequestParam from "./components/RequestParam";
import NestedRoutes from "./components/NestedRoutes";


function App() {
  return (
      <Router>
          <Route exact path="/">
              <Home/>
          </Route>
          <Route path="/path-variable/:id">
              <PathVariable/>
          </Route>
          <Route path="/pass-state">
              <PassState/>
          </Route>
          <Route path="/request-param">
              <RequestParam/>
          </Route>
          <Route path="/nested">
              <NestedRoutes/>
          </Route>
      </Router>
  );
}

export default App;
