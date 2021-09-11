import React from 'react';
import { Button } from 'react-bootstrap';
import '../../App.css';
import { Link } from 'react-router-dom';
import Footer from '../Footer';

export default function Plans() {
  return (<div className='plans'>
        
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
       
         </div>
           
  );
}