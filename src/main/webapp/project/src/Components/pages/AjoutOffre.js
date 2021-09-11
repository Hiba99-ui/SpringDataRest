import { Card, Table, Form, Col, Button, FormControl } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faList } from '@fortawesome/free-solid-svg-icons';
import React, { Component } from 'react';
import './AjoutOffre.css';
import '../../App.css';
import axios  from 'axios';
import Footer from '../Footer';

export default class AjoutOffre extends Component{
    constructor(props) {
        super(props);
        this.state=this.initialState;
        this.offreChange = this.offreChange.bind(this);
        this.submitOffre = this.submitOffre.bind(this);
    }
    
    initialState = {
        datedebut:'',
        datefin:'',
        nomendroit:'',
        adresse:'',
        ville:'',
        description:'',
        image:''
    }
    resetOffre = () => {
        this.setState(() => this.initialState);
    }

     submitOffre =event => {
         event.preventDefault(); 
         const offre ={
             datedebut:this.state.datedebut,
             datefin:this.state.datefin,
             nomendroit:this.state.nomendroit,
             adresse:this.state.adresse,
             ville:this.state.ville,
             description:this.state.description,
             image:this.state.image
         };
         axios.post("http://localhost:8080/offres", offre)
    .then(response => {
        if(response.data != null){
            this.setState(this.initialState);
            alert("Offre enregistrée avec succès");
        }
    })
     }

     offreChange = event => {
         this.setState( {
             [event.target.name]:event.target.value
         });
     }

 
    render(){
    return(
        <div className="general">
             <form onReset={this.resetOffre} onSubmit={this.submitOffre} id="OffreFormId">
                  <table>
            <tr>
                <td>
                    <label>Start Date</label>
                </td> 
                <td>
                    <input required value={this.state.datedebut} name="datedebut" type="date"  autoComplete="off" onChange={this.offreChange} placeholder= "Enter the start date"/> 
                </td>
            </tr> 
                    
            
            <tr>
                <td>
                    <label>End Date</label>
                </td> 
                <td>
                    <input required value={this.state.datefin} name="datefin" type="date"  autoComplete="off" onChange={this.offreChange} placeholder= "Enter the end date"/> 
                </td>
            </tr> 

            <tr>
                <td>
                    <label>Place's Name</label>
                </td> 
                <td>
                    <input required value={this.state.nomendroit} name="nomendroit" type="text"  autoComplete="off" onChange={this.offreChange}  placeholder= "Enter the place's name"/> 
                </td>
            </tr> 

            <tr>
                <td>
                    <label>Address</label>
                </td> 
                <td>
                    <textarea required value={this.state.adresse} name="adresse"   autoComplete="off" onChange={this.offreChange}  placeholder= "Enter the address"/> 
                </td>
            </tr> 
            
            <tr>
                <td>
                    <label>City</label>
                </td> 
                <td>
                    <input required value={this.state.ville} name="ville" type="text"  autoComplete="off" onChange={this.offreChange}  placeholder= "Enter the City"/> 
                </td>
            </tr> 

            <tr>
                <td>
                    <label>Description</label>
                </td> 
                <td>
                    <textarea required value={this.state.description} name="description"   autoComplete="off" onChange={this.offreChange}  placeholder= "Enter the description"/> 
                </td>
            </tr> 
            <tr>
                <td>
                    <label>Image</label>
                </td> 
                <td>
                    <input required value={this.state.image} type="file" accept="image/png, image/jpeg" name="image"   autoComplete="off" onChange={this.offreChange}  placeholder= "Enter the image"/> 
                </td>
            </tr> 
            <tr>
                <td>
                   <Button className="casexc"  variant="info" type="reset"> 
                      Reset
                    </Button> 
                </td>
                <td> 
                    <Button className="casexc"  variant="success" type="submit"> 
                      Submit 
                    </Button> 
                </td>
            </tr>
                      
</table>
             </form>
           
      </div>  
      
        );
    }
   
}
//export default AjoutOffre;
