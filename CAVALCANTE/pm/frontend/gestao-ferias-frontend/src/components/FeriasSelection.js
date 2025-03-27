import { useState } from 'react';
import { 
  Paper, Grid, Typography, TextField, Button,
  FormControl, InputLabel, Select, MenuItem 
} from '@mui/material';

function FeriasSelection() {
  const [options, setOptions] = useState({
    option1: { start: '', end: '' },
    option2: { start: '', end: '' },
    option3: { start: '', end: '' }
  });

  return (
    <Paper sx={{ p: 3 }}>
      <Typography variant="h5" gutterBottom>
        Seleção de Férias
      </Typography>
      {[1, 2, 3].map((optionNum) => (
        <Grid container spacing={2} key={optionNum} sx={{ mb: 3 }}>
          <Grid item xs={12}>
            <Typography variant="subtitle1">
              {`${optionNum}ª Opção`}
            </Typography>
          </Grid>
          <Grid item xs={6}>
            <TextField
              fullWidth
              type="date"
              label="Data Início"
              InputLabelProps={{ shrink: true }}
            />
          </Grid>
          <Grid item xs={6}>
            <TextField
              fullWidth
              type="date"
              label="Data Fim"
              InputLabelProps={{ shrink: true }}
            />
          </Grid>
        </Grid>
      ))}
      <Button variant="contained" color="primary" fullWidth>
        Salvar Preferências
      </Button>
    </Paper>
  );
}

export default FeriasSelection;