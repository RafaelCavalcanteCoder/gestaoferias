import axios from "axios";

const API_URL = "http://localhost:8080/api/policiais";

export const cadastrarPolicial = async (policial) => {
  await axios.post(API_URL, policial);
};

export const getPoliciais = async () => {
  const response = await axios.get(API_URL);
  return response.data;
};
