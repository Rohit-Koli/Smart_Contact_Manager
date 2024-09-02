import React from "react";
import axios from "axios";
import { useEffect, useState } from "react";

const Hello = () => {
  const [msg, setMsg] = useState("");

  useEffect(() => {
    axios
      .get("/api/hello")
      .then((response) => {
        setMsg(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);
  return(
   <div>
        {msg}
   </div>
  )
};

export default Hello;
