import { useEffect, useState } from 'react';
import AdminService from '../services/AdminService';

// ... resto do código existente ...

function AdminDashboard() {
  const [limit, setLimit] = useState(15);
  const [allocations, setAllocations] = useState([]);

  useEffect(() => {
    loadAllocations();
  }, []);

  const loadAllocations = async () => {
    try {
      const response = await AdminService.getAllocations();
      setAllocations(response.data);
    } catch (error) {
      console.error('Erro ao carregar alocações:', error);
    }
  };

  const handleUpdateLimit = async () => {
    try {
      await AdminService.setMonthlyLimit(limit);
      alert('Limite atualizado com sucesso!');
    } catch (error) {
      alert('Erro ao atualizar limite');
    }
  };

  // ... resto do código existente ...
}

import {
  Paper, Typography, TextField, Button,
  Table, TableBody, TableCell, TableHead,
  TableRow, Box
} from '@mui/material';

function AdminDashboard() {
  return (
    <Paper sx={{ p: 3 }}>
      <Typography variant="h5" gutterBottom>
        Painel Administrativo
      </Typography>
      <Box sx={{ mb: 4 }}>
        <TextField
          type="number"
          label="Limite de Policiais por Mês"
          defaultValue={15}
          fullWidth
          sx={{ mb: 2 }}
        />
        <Button variant="contained" color="primary">
          Atualizar Limite
        </Button>
      </Box>
      <Typography variant="h6" gutterBottom>
        Alocações Atuais
      </Typography>
      <Table>
        <TableHead>
          <TableRow>
            <TableCell>Mês</TableCell>
            <TableCell>Quinzena</TableCell>
            <TableCell>Policiais Alocados</TableCell>
            <TableCell>Limite</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {/* Add table content here */}
        </TableBody>
      </Table>
    </Paper>
  );
}

export default AdminDashboard;