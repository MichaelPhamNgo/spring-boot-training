import logo from './logo.svg';
import './App.css';
import FunctionalExampleComponent from "./components/FunctionalExampleComponent";
import ClassExampleComponent from "./components/ClassExampleComponent";

function App() {
    // const hello = <h1>Hello World!</h1>;
  return (
    <div className="App">
        <FunctionalExampleComponent/>
        {/*<ClassExampleComponent/>*/}
    </div>
  );
}

export default App;
