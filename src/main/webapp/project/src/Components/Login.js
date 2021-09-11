
import React, { useCallback, useContext } from "react";
import { withRouter, Redirect } from "react-router";
import app from "../firebase.js";
import { AuthContext } from "../Auth.js";
import './Login.css';
import { Button } from 'react-bootstrap'


const Login = ({ history }) => {
  const handleLogin = useCallback(
    async event => {
      event.preventDefault();
      const { email, password } = event.target.elements;
      try {
        await app
          .auth()
          .signInWithEmailAndPassword(email.value, password.value);
        history.push("/ajoutoffre");
      } catch (error) {
        alert(error);
      }
    },
    [history]
  );

  const  currentUser  = useContext(AuthContext);

  if (currentUser) {
    return <Redirect to="/" />;
  }

 return(
  <div className="form-area">
  <h1 className="title">Login</h1>
  <form onSubmit={handleLogin}>
    <div className="form-group1">
    <label className="form-label">
      Email</label>
      <input  className="form-control" name="email" type="email" placeholder="Email" />
    </div>
    <div className="form-group2">
    <label className="form-label">
      Password
      </label>
      <input  className="form-control1" name="password" type="password" placeholder="Password" />
    </div>
    
    <Button  classname="button" type="submit">
     <p className="textbutton"> Login </p>
      </Button>
    
  </form>
</div>
);
};
   export default withRouter(Login);
 

