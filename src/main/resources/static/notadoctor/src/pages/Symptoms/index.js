import React, {useEffect, useState} from "react";

import Axios from 'axios';

const SymptomsAPI = () => {
    const [symptoms, setSymptoms] = useState(null);
    const [uploading, setLoading] = useState(true);
    
    useEffect(() => {
        const fetchSymptomsData = async () => {
            const result = await Axios('http://localhost:8080/symptoms');
            setSymptoms(result.data);
            console.log(result.data);

        }
        if(symptoms) {
            setLoading(false);
        }
        const timer = setTimeout(() => {
            !symptoms && fetchSymptomsData();

        }, 250);
        return () => clearTimeout(timer);
        //eslint-disable-next-line
    }, [symptoms]);

    return ( 
        <div className={style.symptomsDiv}>
        {uploading ? <h3>setLoading...</h3> :
    
    <div className={style.symptoms_shadowbox}>

        <section className={style.symptomsSection}>
            <div className={style.symptomsText}>
                <h1>PlaceHolder Symptoms Test</h1>
                <div className={style.symptomsGrid} key={symptoms.id}>
                    {symptoms.map(symptoms => (
                        <div>
                            <h1 className={style.symptoms_name}>{symptoms.name}</h1>
                </div>
    ))}
            </div>
        </div>
    </section>
    </div>
        }
        </div>
    )
}

export default SymptomsAPI;

