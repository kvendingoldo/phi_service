import SimpleCrypto from "simple-crypto-js";

var _secretKey = SimpleCrypto.generateRandom(256);

var simpleCrypto = new SimpleCrypto(_secretKey);

var plainText = "Hello World!";
var chiperText = simpleCrypto.encrypt(plainText);
console.log("Encryption process...");
console.log("Plain Text    : " + plainText);
console.log("Cipher Text   : " + cipherText);
var decipherText = simpleCrypto.decrypt(cipherText);
console.log("... and then decryption...");
console.log("Decipher Text : " + decipherText);
console.log("... done.");