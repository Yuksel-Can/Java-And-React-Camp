import React from 'react'
import { Grid } from 'semantic-ui-react'
import ProductList from '../pages/ProductList'
import Categories from './Categories'
import Navi from './Navi'
export default function Dashboard() {
    return (
        <div>
            <Grid>
                <Grid.Row>
                    <Grid.Column width={4}>
                        <Categories />
                    </Grid.Column>
                    <Grid.Column width={12}>
                        <ProductList />
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div>
    )
}
