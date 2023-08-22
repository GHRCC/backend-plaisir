import React from 'react'
import {FaUser, FaShoppingCart} from 'react-icons/fa'


const Header = () => {
  return (
    <header className='flex items-center w-auto h-24 bg-red-500 '>
      <h1 className='flex grow text-xl ml-16'>
        Plaisir
      </h1>
      <div className='flex items-center space-x-4 mr-4'>
        <span>Carrinho</span>
      <FaShoppingCart/>
      <span>Faça seu login</span>
      <FaUser/> 
      </div>
    </header>
  )
}

export default Header
