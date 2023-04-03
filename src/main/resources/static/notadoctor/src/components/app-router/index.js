import { Route, Switch } from 'react-router-dom';

import Symptoms from '../../pages/Symptoms';

const AppRouter = () => {
    return (

        <Switch>
            <Route exact path={'/symptoms'} component={Home} />
        </Switch>
    );
}

export default AppRouter;
