import "./App.css";
import { BrowserRouter as Router ,Route,Routes} from "react-router-dom";
import Navbar from "./Components/public/Navbar";
import HomePage from "./Components/public/HomePage";
import Hello from "./Components/public/Hello";
import About from "./Components/public/About";
import Services from "./Components/public/Services";
import Contact from "./Components/public/Contact";
import SignUp from "./Components/public/SignUp";
import Login from "./Components/public/Login";
function App() {
  
  return (
    <>
      <Router>
        <Navbar/>
        <div className="pt-14">
          <Hello/>
        </div>
        <Routes>
          <Route path="/about" element={<About/>}/>
          <Route path="/home" element={<HomePage/>}/>
          <Route path="/services" element={<Services/>}/>
          <Route path="/contact" element={<Contact/>}/>
          <Route path="/login" element={<Login/>}/>
          <Route path="/signup" element={<SignUp/>}/>
        </Routes>
      </Router>
    </>
  );
}

export default App;
