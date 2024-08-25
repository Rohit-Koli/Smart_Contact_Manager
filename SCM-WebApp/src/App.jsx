import { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <h1 className="text-3xl font-bold underline">Hello Rohit!</h1>
      <h1 className="text-3xl font-bold underline">Hello Tushar!</h1>
      <h1 className="text-3xl font-bold underline">Hello Meghraj!</h1>
    </>
  );
}

export default App;
