
import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
 
 return ( 
 <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="Venda" />
            <h1>VENDAS ALERT</h1>
            <p>
               Desenvolvido por 
          <div  className='redeSocial'>   <a href="https://www.instagram.com/s_sgabriel/"> @S_SGabriel</a> </div>
            </p>
        </div>
    </header>
 )
}

export default Header
