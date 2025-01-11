import logo from './logo.svg';
import './App.css';
import Home from "./components/Home";
import ToDoReducer from "./reducer/ToDoReducer";
import {createStore} from "redux";
import {Provider} from "react-redux";
import {BrowserRouter as Router, Route} from "react-router-dom";
import DetailsPage from "./components/DetailsPage";

const store = createStore(ToDoReducer)

function App() {
  return (
      <Provider store={store}>
          <Router>
              <Route exact path="/">
                  <Home/>
              </Route>
              <Route exact path="/details">
                  <DetailsPage/>
              </Route>
          </Router>
      </Provider>
  );
}

export default App;
