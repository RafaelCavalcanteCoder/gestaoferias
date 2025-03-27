import React, { useEffect, useState } from "react";
import { getPoliciais } from "../services/PolicialService";

const PolicialList = () => {
  const [policiais, setPoliciais] = useState([]);

  useEffect(() => {
    const fetchPoliciais = async () => {
      const result = await getPoliciais();
      setPoliciais(result);
    };
    fetchPoliciais();
  }, []);

  return (
    <div>
      <h2>Lista de Policiais</h2>
      <ul>
        {policiais.map((policial) => (
          <li key={policial.id}>
            {policial.nome} - {policial.graduacao}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default PolicialList;
