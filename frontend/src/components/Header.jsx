import React from 'react'
import {FaUser, FaShoppingCart} from 'react-icons/fa'
import logo from '../assets/logo.jpg'

const Header = () => {
  return (
    <header className='flex items-center w-auto h-28 bg-rosa '>
    <img src={logo} alt='logo' className='w-auto h-full '/>
      <h1 className='flex grow text-xl ml-16'>
        Plaisir
      </h1>
      <div className='flex items-center space-x-4 mr-4'>
      <div className='flex items-center space-x-4 cursor-pointer hover:text-white'>
      <span>Carrinho</span>
      <FaShoppingCart/>
      </div>
      <div className='flex items-center space-x-4 cursor-pointer hover:text-white'>
      <span>Faça seu login</span>
      <FaUser/> 
      </div>
      </div>
    </header>
  )
}

export default Header
