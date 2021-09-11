import React, { Component } from 'react';
import './Footer.css';
import { Button } from './Button';
import { Link } from 'react-router-dom';
import axios  from 'axios';

export default class Footer extends Component{

  constructor(props) {
    super(props);
    this.state=this.initialState;
    this.clientChange = this.clientChange.bind(this);
    this.submitClient = this.submitClient.bind(this);
}

initialState = {
    email:''
}
resetClient = () => {
    this.setState(() => this.initialState);
}

 submitClient =event => {
     event.preventDefault(); 
     const client ={
         email:this.state.email
     };
     axios.post("http://localhost:8080/clients", client)
.then(response => {
    if(response.data != null){
        this.setState(this.initialState);
        alert("success");
    }
})
 }

 clientChange = event => {
     this.setState( {
         [event.target.name]:event.target.value
     });
 }


  render(){
  return (
    <div className='footer-container'>
      <section className='footer-subscription'>
        <p className='footer-subscription-heading'>
        Join us to receive our exclusives plans
        </p>
        <p className='footer-subscription-text'>
          
        </p>
        <div className='input-areas'>
          <form onReset={this.resetClient} onSubmit={this.submitClient} id="ClientFormId">
            <input
              className='footer-input'
      
              required value={this.state.email} 
              
              name="email"
              type="email"
              placeholder="Your Email"
              autoComplete="off" 
              onChange={this.clientChange} 
            />
            <Button type="submit" variant="success" buttonStyle='btn--outline'>
              Subscribe
              </Button>
          </form>
        </div>
      </section>
      <div class='footer-links'>
        <div className='footer-link-wrapper'>
          
          <div class='footer-link-items'>
            <h2>Contact Us</h2>
           <div className='footer-contact'> <i class="fas fa-home" /> A , 2ème Etage, Résidence Lisstikrar, 408 Bd Mohamed Zerktouni, Rabat</div>
     
           <div className='footer-contact'> <i class="fas fa-phone-alt" /> 05 37 68 67 40</div>
           
           <div className='footer-contact'> <i class="fas fa-fax" /> 05 37 68 67 40 </div>
         
           <div className='footer-contact'> <i class="far fa-envelope" /> superplan21@gmail.com </div>
          </div>
        </div>
        <div className='footer-link-wrapper'>
        <div class='footer-link-items'>
          </div>
        </div>
        <div className='footer-link-wrapper'>
        <div class='footer-link-items'>
          </div>
        </div>
        <div className='footer-link-wrapper'>        
          <div class='footer-link-items'>
            <h2>Social Media</h2>
            <Link to='/'>Instagram</Link>
            <Link to='/'>Facebook</Link>
            <Link to='/'>Youtube</Link>
            <Link to='/'>Twitter</Link>
          </div>
        </div>
      </div>
      <section class='social-media'>
        <div class='social-media-wrap'>
          <div class='footer-logo'>
            <Link to='/' className='social-logo'>
              Super Plan
              <i class='fas fa-gem' />
            </Link>
          </div>
          <small class='website-rights'>Super Plan © 2021</small>
          <div class='social-icons'>
            <Link
              class='social-icon-link facebook'
              to='/'
              target='_blank'
              aria-label='Facebook'
            >
              <i class='fab fa-facebook-f' />
            </Link>
            <Link
              class='social-icon-link instagram'
              to='/'
              target='_blank'
              aria-label='Instagram'
            >
              <i class='fab fa-instagram' />
            </Link>
            <Link
              class='social-icon-link youtube'
              to='/'
              target='_blank'
              aria-label='Youtube'
            >
              <i class='fab fa-youtube' />
            </Link>
            <Link
              class='social-icon-link twitter'
              to='/'
              target='_blank'
              aria-label='Twitter'
            >
              <i class='fab fa-twitter' />
            </Link>
            <Link
              class='social-icon-link twitter'
              to='/'
              target='_blank'
              aria-label='LinkedIn'
            >
              <i class='fab fa-linkedin' />
            </Link>
          </div>
        </div>
      </section>
    </div>
  );
}
}
