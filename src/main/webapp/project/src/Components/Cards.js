import React from 'react';
import './Cards.css';
import CardItem from './CardItem';
import img1 from '../images/img-9.jpg';
import img2 from '../images/img-01.jpg';
import img3 from '../images/img-3.jpg';
import img4 from '../images/img-4.jpg';
import img5 from '../images/img-02.jpg';


function Cards() {
  return (
    <div className='cards'>
      <h1>Plans of the week !</h1>
      <div className='cards__container'>
        <div className='cards__wrapper'>
          <ul className='cards__items'>
            <CardItem
              src={img1}
              text='Starter dish + Principal dish ==> Free Dessert'
              label='Restaurant'
              path='/plans'
            />
            <CardItem
              src={img2}
              text='Free Coktails for ladies every day'
              label='Lounge Restaurant'
              path='/plans'
            />
          </ul>
          <ul className='cards__items'>
            <CardItem
              src={img3}
              text='Facial treatment + Massage ==> 500DH'
              label='Beauty Center'
              path='/plans'
            />
            <CardItem
              src={img4}
              text='Luxury breakfast for two ==> 150DH'
              label='Coffee Shop'
              path='/products'
            />
            <CardItem
              src={img5}
              text='2 Rounds of Karting ==> 200DH'
              label='Game'
              path='/sign-up'
            />
          </ul>
        </div>
      </div>
    </div>
  );
}

export default Cards;
