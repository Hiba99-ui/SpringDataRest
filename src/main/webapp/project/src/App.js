import logo from './logo.svg';
import React from 'react';
import Navbar from './Components/Navbar';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import './App.css';
import Home from './Components/pages/Home';
import Plans from './Components/pages/Plans';
import SignUp from './Components/pages/SignUp';
import LoginPage from './Components/pages/LoginPage';
import AjoutOffre from './Components/pages/AjoutOffre';
import PlanRabat from './Components/pages/PlanRabat';
import PlanCasablanca from './Components/pages/PlanCasablanca';
import PlanMarrakech from './Components/pages/PlanMarrakech';
import PlanAgadir from './Components/pages/PlanAgadir';

function App() {
  return (
    <>
    <Router>
    <Navbar />
    <Switch>
    <Route path='/' exact component={Home} />
          <Route path='/plans' component={Plans} />
          <Route path='/loginpage' component={LoginPage} />
          <Route path='/signup' component={SignUp} />
          <Route path='/ajoutoffre' component={AjoutOffre} />
          <Route path='/rabat' component={PlanRabat} />
          <Route path='/casablanca' component={PlanCasablanca} />
          <Route path='/marrakech' component={PlanMarrakech} />
          <Route path='/agadir' component={PlanAgadir} />
    </Switch>
    </Router>
  </>
  );
}

export default App;
