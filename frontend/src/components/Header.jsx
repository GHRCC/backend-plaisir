import React from 'react'
import {FaUser, FaShoppingCart} from 'react-icons/fa'

const Header = () => {
  return (
    <header className='flex items-center'>
      <h1>
        Plaisir
      </h1>
      <FaShoppingCart/>
      <FaUser/> 
    </header>
  )
}

export default Header
