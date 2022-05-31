import fetch from 'unfetch'; 

export const getAllBuyers = () => fetch('/internal/buyers/all');
