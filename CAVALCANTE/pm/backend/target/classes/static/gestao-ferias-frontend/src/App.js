import React, { useState } from "react";
import Login from "./components/Login";
import PolicialForm from "./components/PolicialForm";
import PolicialList from "./components/PolicialList";

const App = () => {
  const [logado, setLogado] = useState(false);

  const handleLogin = () => {
    setLogado(true);
  };

  return (
    <div>
      {!logado ? (
        <Login onLogin={handleLogin} />
      ) : (
        <div>
          <h1>Gestão de Férias PM</h1>
          <PolicialForm />
          <PolicialList />
        </div>
      )}
    </div>
  );
};

export default App;
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { CssBaseline, Box, Container } from '@mui/material';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import PolicialList from './components/PolicialList';
import PolicialForm from './components/PolicialForm';
import FeriasSelection from './components/FeriasSelection';
import AdminDashboard from './components/AdminDashboard';
import Login from './components/Login';

const theme = createTheme({
  palette: {
    primary: {
      main: '#1a237e',
    },
    secondary: {
      main: '#c62828',
    },
  },
});

function App() {
  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <BrowserRouter>
        <Navbar />
        <Container maxWidth="lg">
          <Box sx={{ py: 4 }}>
            <Routes>
              <Route path="/login" element={<Login />} />
              <Route path="/policiais" element={<PolicialList />} />
              <Route path="/cadastro" element={<PolicialForm />} />
              <Route path="/ferias" element={<FeriasSelection />} />
              <Route path="/admin" element={<AdminDashboard />} />
            </Routes>
          </Box>
        </Container>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;