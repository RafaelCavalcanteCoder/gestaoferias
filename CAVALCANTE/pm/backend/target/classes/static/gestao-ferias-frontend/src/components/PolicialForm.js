import React, { useState } from "react";
import { cadastrarPolicial } from "../services/PolicialService";

const PolicialForm = () => {
  const [nome, setNome] = useState("");
  const [graduacao, setGraduacao] = useState("");
  const [dataUltimaPromocao, setDataUltimaPromocao] = useState("");
  const [classificacaoConcurso, setClassificacaoConcurso] = useState("");
  const [dataIngressoPM, setDataIngressoPM] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    const policial = {
      nome,
      graduacao,
      dataUltimaPromocao,
      classificacaoConcurso,
      dataIngressoPM,
    };

    await cadastrarPolicial(policial);
    setNome("");
    setGraduacao("");
    setDataUltimaPromocao("");
    setClassificacaoConcurso("");
    setDataIngressoPM("");
  };

  return (
    <div>
      <h2>Cadastrar Policial</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Nome"
          value={nome}
          onChange={(e) => setNome(e.target.value)}
        />
        <input
          type="text"
          placeholder="Graduação"
          value={graduacao}
          onChange={(e) => setGraduacao(e.target.value)}
        />
        <input
          type="date"
          value={dataUltimaPromocao}
          onChange={(e) => setDataUltimaPromocao(e.target.value)}
        />
        <input
          type="number"
          placeholder="Classificação no Concurso"
          value={classificacaoConcurso}
          onChange={(e) => setClassificacaoConcurso(e.target.value)}
        />
        <input
          type="date"
          value={dataIngressoPM}
          onChange={(e) => setDataIngressoPM(e.target.value)}
        />
        <button type="submit">Cadastrar</button>
      </form>
    </div>
  );
};

export default PolicialForm;
