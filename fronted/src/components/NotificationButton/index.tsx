import axios from 'axios';
import icon from '../../assets/img/icon-notificacao.svg'
import { BASE_URL } from '../../utils/request';
import './styles.css'


type Props = {
    saleId: number;
}

function handleClick(id : number){
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response => {
        console.log("SUCESSO")
    })
    

} 

function NoticationButton({saleId} : Props) {
    return (
    <div className='dsmeta-red-btn' onClick={() => handleClick(saleId)}>
   <img src={icon} alt="" />
   </div>
    
    )
   }
   
   export default NoticationButton
   