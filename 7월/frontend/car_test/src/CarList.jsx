import axios from "axios";
import { useEffect, useState } from "react";
import "./CarList.css"

const CarList = () => {
  const [carList, setCarList] = useState([])
  
  useEffect(() => {
    axios.get('http://localhost:80/cars')
      .then((response) => {
        setCarList(response.data)
      })
  }, []);

  return (
    <div>
      <h2>🚘 Car Application</h2>
      <table className="carTable">
        <thead>
          <tr>
            <th>ID</th>
            <th>브랜드</th>
            <th>모델</th>
            <th>연식</th>
            <th>색상</th>
            <th>등록번호</th>
            <th>가격</th>
            <th>소유자</th>
          </tr>
        </thead>
        <tbody>
          {carList.map((car) => (
            <tr key={car.id}>
              <td>{car.id}</td>
              <td>{car.brand}</td>
              <td>{car.model}</td>
              <td>{car.modelYear}</td>
              <td>{car.color}</td>
              <td>{car.registrationNumber}</td>
              <td>${car.price.toLocaleString()}</td>
              <td>{car.owner.firstname} {car.owner.lastname}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default CarList