import moment from 'moment-timezone';

// Capturing current time as ISO-8601 UTC timestamp
const iso8601UtcTimestamp = new Date().toISOString();
// or
//const iso8601UtcTimestamp = moment().toISOString()

// Printing timestamp
console.log("-----------------------------------------------------------------------------------------------");
console.log(`ISO-8601 UTC Timestamp: ${iso8601UtcTimestamp}`);


// Converting current time to some locations' local time

// Honolulu
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Honolulu: ${moment.tz(iso8601UtcTimestamp,"Pacific/Honolulu")}`);

// New York City
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in New York City: ${moment.tz(iso8601UtcTimestamp,"America/New_York")}`);

// Azores
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Azores: ${moment.tz(iso8601UtcTimestamp,"Atlantic/Azores")}`);

// Lisbon
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Lisbon: ${moment.tz(iso8601UtcTimestamp,"Europe/Lisbon")}`);

// Kolkata
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Kolkata: ${moment.tz(iso8601UtcTimestamp,"Asia/Kolkata")}`);

// Tokyo
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Tokyo: ${moment.tz(iso8601UtcTimestamp,"Asia/Tokyo")}`);

// Kiritimati
console.log("-----------------------------------------------------------------------------------------------");
console.log(`Local time in Kiritimati: ${moment.tz(iso8601UtcTimestamp,"Pacific/Kiritimati")}`);



console.log("-----------------------------------------------------------------------------------------------");