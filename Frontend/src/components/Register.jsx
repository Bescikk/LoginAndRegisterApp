import { useState } from 'react';
import axios from 'axios';

function Register() {
	const [employeename, setEmployeename] = useState('');

	const [email, setEmail] = useState('');
	const [password, setPassword] = useState('');

	async function save(event) {
		event.preventDefault();
		try {
			await axios.post('http://localhost:8081/api/v1/employee/save', {
				employeename: employeename,
				email: email,
				password: password,
			});
			alert('Successful employee registration');
		} catch (err) {
			alert(err);
		}
	}

	return (
		<div>
			<div className='containder mt-4'>
				<div className='card'>
					<h1>Employee Registration</h1>

					<form>
						<div className='form-group'>
							<label>Employee name</label>
							<input
								type='text'
								name='employeename'
								className='form-control'
								id='employeename'
								placeholder='Enter name'
								value={employeename}
								onChange={(event) => {
									setEmployeename(event.target.value);
								}}
							/>
						</div>

						<div className='form-group'>
							<label>Employee email</label>
							<input
								type='email'
								className='form-control'
								id='email'
								placeholder='Enter email'
								value={email}
								onChange={(event) => {
									setEmail(event.target.value);
								}}
							/>
						</div>

						<div className='form-group'>
							<label>Employee password</label>
							<input
								type='password'
								className='form-control'
								id='password'
								placeholder='Enter password'
								value={password}
								onChange={(event) => {
									setPassword(event.target.value);
								}}
							/>
						</div>

						<button type='submit' className='btn btn-primary mt-4' onClick={save}>
							Save
						</button>
					</form>
				</div>
			</div>
		</div>
	);
}

export default Register;
