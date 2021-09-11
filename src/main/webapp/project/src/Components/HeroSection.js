import React from 'react';
import '../App.css';
import { Button } from './Button';
import './HeroSection.css';
import video1 from "../videos/video1.mp4"; 
import { Link } from 'react-router-dom';

function HeroSection() {
  return (
    <div className='hero-container'>
      <video  autoPlay loop muted>
          <source src={video1} type="video/mp4"/>
      </video>
      <h1>YOUR PLAN IS ALWAYS HERE </h1>
      <p>What are you waiting for ?</p>
      <div className='hero-btns'>
        <Link to="/loginpage">
        <Button
          className='btns'
          buttonStyle='btn--outline'
          buttonSize='btn--large'
        >
          I HAVE A GOOD PLAN FOR YOU <i class="fas fa-plus" />
        </Button>
        </Link>
        <Link to="/plans">
        <Button
          className='btns'
          buttonStyle='btn--primary'
          buttonSize='btn--large'
          onClick={console.log('hey')}
         
        >
          I'AM LOOKING FOR A GOOD PLAN <i className='fas fa-search' />
        </Button>
        </Link>
      </div>
    </div>
  );
}

export default HeroSection;