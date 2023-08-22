import React from 'react'

const Footer = () => {
    const currentYear = new Date().getFullYear()
  return (
    <footer className='w-auto'>
      <p>
        Plaisir &copy; {currentYear} 
      </p>
    </footer>
  )
}

export default Footer
