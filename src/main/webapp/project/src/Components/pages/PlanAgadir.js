import React, { Component } from 'react';
import { Table } from 'react-bootstrap';
import '../../App.css';
import { Link } from 'react-router-dom';

import { Button } from 'react-bootstrap';

import axios  from 'axios';

export class PlanAgadir extends Component{
    constructor(props){
        super(props);
        this.state = {
          offres : []
        };
      }
      componentDidMount(){
        axios.get("http://localhost:8080/offres/agadir")
        .then(response => response.data)
        .then((data) => {
          this.setState({offres: data})
    
        });
      }




 render(){
  return (<div className='plansville'>
    <table className="links" >
          <tr ><th>
      <Link to="/rabat">
         <Button className="ville1">
          Rabat
         </Button>
         </Link>
         <Link to="/casablanca">
         <Button className="ville2">
          Casablanca
         </Button>
         </Link>
         <Link to="/marrakech">
         <Button className="ville2">
          Marrakech
         </Button>
         </Link>
         <Link to="/agadir">
         <Button className="ville2">
          Agadir
         </Button>
         </Link>
         </th></tr>
         <tr><td>
      <Table className="offre">
    {

          this.state.offres.length ===0 ?
          <p></p> :
       this.state.offres.map((offre) =>(
   
         <tr>     
             <td>
             <img src={offre.image} alt="" width="200px" height="168px" />
             </td>
             <td>
        <div className="zone">
        <h3>Welcome to {offre.nomendroit} !</h3>
        <p className="espace">.</p>
        <p className="description"> {offre.description} </p>
        <p className="datefin"><i class="fas fa-exclamation-triangle" />Valid until : {offre.datefin}</p>
        <p className="espace">.</p>
        <p className="adresse"><i class="fas fa-map-marker-alt"/> {offre.adresse}</p>

        <div>
        
        </div>
        </div>
        </td>
        </tr>
        
          ) )
 }
 </Table>
 </td></tr>
 </table>
 </div>

  );
}
}
export default PlanAgadir;
