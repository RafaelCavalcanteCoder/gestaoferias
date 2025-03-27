import axios from 'axios';

const BASE_URL = 'http://localhost:8080/api';

class AdminService {
  setMonthlyLimit(limit) {
    return axios.post(`${BASE_URL}/admin/limit`, { limit });
  }

  getAllocations() {
    return axios.get(`${BASE_URL}/admin/allocations`);
  }
}

export default new AdminService();