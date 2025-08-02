import React, { useState } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {isLoggedIn ? (
        <UserPage onLogout={() => setIsLoggedIn(false)} />
      ) : (
        <GuestPage onLogin={() => setIsLoggedIn(true)} />
      )}
    </div>
  );
}

export default App;
